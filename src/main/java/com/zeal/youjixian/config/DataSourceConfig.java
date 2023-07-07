package com.zeal.youjixian.config;

/**
 * WHAT THE ZZZZEAL
 *
 * @author zeal
 * @version 1.0
 * @since 2023/7/6 23:05
 */
//
//@Configuration
//@MapperScan(basePackages = "com.zeal.youjixian.mapper")
//public class DataSourceConfig {
//
//    @Value("${mybatis-plus.mapper-locations}")
//    private String mapperLocations;
//    //配置FactoryBean
//    @Bean(name = "sqlSessionFactoryBean")
//    public SqlSessionFactoryBean sqlSessionFactoryBean() {
//        SqlSessionFactoryBean sqlSessionFactoryBean = null;
//        try {
//            // 加载JNDI配置
//            Context context = new InitialContext();
//            // 实例SessionFactory
//            sqlSessionFactoryBean = new SqlSessionFactoryBean();
//            // 配置数据源
//            sqlSessionFactoryBean.setDataSource(dataSource());
//            // 加载MyBatis配置文件
//            PathMatchingResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
//            // 能加载多个，所以可以配置通配符(如：classpath*:mapper/**/*.xml)
//            sqlSessionFactoryBean.setMapperLocations(resourcePatternResolver.getResources(mapperLocations));
//        } catch (Exception e) {
//            System.out.println("创建SqlSession连接工厂错误：{}");
//        }
//        return sqlSessionFactoryBean;
//    }
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
//        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactoryBean().getObject(), ExecutorType.BATCH);
//        return sqlSessionTemplate;
//    }
//
//}