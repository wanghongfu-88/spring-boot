
# lombok整理  
+ [@DATA](https://projectlombok.org/features/Data)注解在类上；提供类所有属性的 getting 和 setting 方法，此外还提供了equals、canEqual、hashCode、toString 方法  
+ [@Setter](https://projectlombok.org/features/GetterSetter) 注解在属性上；为属性提供 setting 方法  
+ [@Getter](https://projectlombok.org/features/GetterSetter) 注解在属性上；为属性提供 getting 方法
+ [@Log4j](https://projectlombok.org/features/Log4j) 注解在类上；为类提供一个 属性名为log 的 log4j 日志对象 
+ [@NoArgsConstructor](https://projectlombok.org/features/constructor) 提供一个无参数的构造方法 
+ [@AllArgsConstructor](https://projectlombok.org/features/constructor) 提供一个无参数的构造方法 
+ [@Cleanup]()关闭流 
+ [@Builder]() 备注解的类加个构造者模式
+ [@Synchronized]()加个同步锁  
+ [@SneakyThrows]()加个try-catch块
+ [@NonNull]() 如果给参数加个这个注解 参数为null会抛出空指针异常   
+ [@Value]() 注解和@Data类似，区别在于它会把所有成员变量默认定义为private final修饰，并且不会生成set方法
