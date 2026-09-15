package com.neusoft.tijiancms.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 医生信息表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
	private Integer docId;      // 医生编号
	private String docCode;     // 医生编码（登录用）
	private String realName;    // 真实姓名
	private String password;    // 密码（登录用）
	private Integer sex;        // 性别（1：男；0：女）
	private Integer deptno;     // 所属科室（1：检验科；2：内科；3：外科）
}