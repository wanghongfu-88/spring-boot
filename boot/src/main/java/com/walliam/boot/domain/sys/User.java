package com.walliam.boot.domain.sys;

import com.walliam.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;


@Data
@Builder
@ApiModel(value="User",description = "用户对象实体")
public class User extends BaseEntity {

    @ApiModelProperty(name = "id",value="id",required = true,dataType = "Long")
    private Long id;
    @NonNull
    @ApiModelProperty(name="orgCode",value="网点名称")
    private String orgCode;             //     网点代码
    private String jobNo;               //     工号
    private String username;            //     用户名
    private String nickname;            //     昵称
    private String bankName;            //     开户行
    private String bankBranchName;      //     支行名称
    private String bankCardNo;          //     银行卡号
    private String headPic;             //     头像
    private String password;            //     密码
    private String phone;           	//     手机
    private String email;               //     邮箱
    private Integer bindPay;            //     付款类型绑定情况（顺序： |百度|微信|支付宝）
    private String jGPhone;             //    金刚手机号

}
