package com.walliam.boot.service.impl;

import com.walliam.boot.domain.sys.User;
import com.walliam.boot.service.IUserService;
import com.walliam.common.redis.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@CacheConfig(cacheNames = {"users"})
public class UserServiceImpl implements IUserService {

    /**
    *  @Cacheable：将方法的运行结果进行保存，以后再要相同的数据，直接从缓存中获取，不用调用方法
    * CacheManager管理多个Cache组件，对缓存的真正CRUD操作在Cache组件中，每个缓存组件有自己唯一的名字
    * 属性：（缓存数据时使用key-value的形式）
    *      cacheNames/value：指定缓存组件的名字；将方法的返回结果放在哪个缓存中，是数组的方式，可以指定多个缓存
    *      key：缓存数据使用的key；可以用她来指定。默认是使用方法参数的值 键值对：1-方法的返回值
    *          参数id的值：#id相当于#root.args[0]
    *      keyGenerator：key的生成器；可以自己指定key的生成器组件id
    *          ——key和keyGenerator不可同时使用
    *      cacheManager：指定缓存管理器（从哪个缓存管理器中取）；cacheResolver：指定缓存解析器
    *      condition：指定符合条件的情况下才缓存；condition="#id>0"：id大于0的时候才缓存
    *      unless：否定缓存；当unless指定的true，方法的返回值就不会被缓存；可以获取到结果进行判断
    *          unless="#result == null":结果为空时不缓存
    *      sync：缓存是否使用异步模式
    */
    @Cacheable(value = {"users"},key = "#id")
    public User getUserOne(long id){
        log.info("缓存日志----------------------------------------------------------" );
        return User.builder().id(id).orgCode("201560")
                .jobNo("01585524")
                .email("wef@qq.com").build();
    }

    /**
     * @CachePut:既调用方法，又更新缓存数据；
     * 修改了数据库的某个数据，同时更新缓存
     * 运行过程：
     *  1、先调用目标方法
     *  2、将目标方法的结果缓存起来
     * 更新后重新查询出的数据是更新前的数据：
     *  ——（key默认使用方法参数的值）查询是的缓存是@Cacheable缓存的值，key是1；@CachePut更新后缓存的值：key是传入的employee对象
     *  ——所以要统一key：key="#employee.id";key="#result.id";
     */
    @CachePut(value = {"users"},key = "#user.id")
    @Override
    public User updateUser(User user) {
        user.setOrgCode("111111");
        user.setJobNo("015899999");
        return user;
    }
    /**
     *@CacheEvict缓存清除
     * key：指定要清楚的数据
     * allEntries=true:指定清除这个缓存中的所有数据
     * beforeInvocation = false；缓存的清除是否在方法之前执行；false：在方法执行之后清除
     */
    @Override
    @CacheEvict(value = "users",key = "#user.id")
    public void deleteUser(User user) {

    }
    /**
     * 指定多个缓存规则
     */
    @Caching(
            cacheable = {
                    @Cacheable(value = "users",key = "#user.jobNo")
            },
            put={
                    @CachePut(value = "users",key="#result.id"),
                    @CachePut(value = "users",key = "#result.email")
            }
    )
    @Override
    public User getUserByJob(User user) {
        return User.builder().id(123L).orgCode("201560")
                .jobNo("01585524")
                .email("wef@qq.com").build();
    }

}
