package com.ypan.project.generate;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import org.junit.jupiter.api.Test;

public class CodeGenerator {

//    @Test
//    public void genCode() {
//        // 1、创建代码生成器
//        AutoGenerator mpg = new AutoGenerator();
//        // 2、全局配置
//        GlobalConfig gc = new GlobalConfig();
//        String projectPath = System.getProperty("user.dir");
//        gc.setOutputDir(projectPath + "/src/main/java");
//        gc.setAuthor("pan");
//        gc.setOpen(false); //生成后是否打开资源管理器
//        gc.setServiceName("%sService"); //去掉Service接口的首字母I
//        gc.setIdType(IdType.AUTO); //主键策略
//        gc.setSwagger2(true);//开启Swagger2模式
//        mpg.setGlobalConfig(gc);
//        // 3、数据源配置
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setUrl("jdbc:mysql://101.43.34.30:30766/pan-spring-boot?serverTimezone=GMT%2B8&characterEncoding=utf-8");
//        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//        dsc.setUsername("root");
//        dsc.setPassword("root");
//        dsc.setDbType(DbType.MYSQL);
//        mpg.setDataSource(dsc);
//        // 4、包配置
//        PackageConfig pc = new PackageConfig();
//        pc.setParent("com.biz");
//        pc.setEntity("entity"); //此对象与数据库表结构一一对应，通过 DAO 层向上传输数据源对象。
//        mpg.setPackageInfo(pc);
//        // 5、策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        strategy.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体的命名策略
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//数据库表字段映射到实体的命名策略
//        strategy.setEntityLombokModel(true); // lombok
//        strategy.setLogicDeleteFieldName("del_flag");//逻辑删除字段名
//        strategy.setEntityBooleanColumnRemoveIsPrefix(true);//去掉布尔值的is_前缀（确保tinyint(1)）
//        strategy.setRestControllerStyle(true); //restful api风格控制器
//        // 指定表名，如果不指定则默认这个数据库全部的表
//        //strategy.setInclude("t_user");
//        mpg.setStrategy(strategy);
//        // 6、执行
//        mpg.execute();
//    }
}
