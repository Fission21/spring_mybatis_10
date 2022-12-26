package com.mx.dao;

import org.apache.ibatis.annotations.Insert;

public interface LogDao {
    @Insert("insert t_info(info,createDate)values(#{info},now())")
    void log(String info);
}
