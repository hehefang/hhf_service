/**
 * Copyright (c)2013-2014 by www.hhf.com. All rights reserved.
 * 
 */

package com.hhf.common.mybatis;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

/**
 * 
 * mybatis类型转换器，实现从jdbc的CHAR(1)类型到java的Boolean类型的映射，支持NULL值
 * 
 * @author xuzunyuan
 * @date 2013年12月25日
 */
public class BooleanTypeHandler implements TypeHandler<Boolean> {
	private static final String TRUE = "1"; // 正确
	private static final String FALSE = "0"; // 错误

	@Override
	public Boolean getResult(ResultSet arg0, String arg1) throws SQLException {
		String str = arg0.getString(arg1);

		return (str == null) ? null : (str.equals(BooleanTypeHandler.TRUE));
	}

	@Override
	public Boolean getResult(ResultSet arg0, int arg1) throws SQLException {
		String str = arg0.getString(arg1);

		return (str == null) ? null : (str.equals(BooleanTypeHandler.TRUE));
	}

	@Override
	public Boolean getResult(CallableStatement arg0, int arg1)
			throws SQLException {
		String str = arg0.getString(arg1);

		return (str == null) ? null : (str.equals(BooleanTypeHandler.TRUE));
	}

	@Override
	public void setParameter(PreparedStatement arg0, int arg1, Boolean arg2,
			JdbcType arg3) throws SQLException {

		if (arg2 == null) {
			arg0.setNull(arg1, Types.CHAR);

		} else {
			arg0.setString(arg1, (arg2 ? BooleanTypeHandler.TRUE
					: BooleanTypeHandler.FALSE));
		}

	}

}
