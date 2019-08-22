package com.walliam.boot.domain.sys;

import com.walliam.common.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Min;

@Data
@Builder
public class User extends BaseEntity {

    private Long id;
    @NonNull
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
