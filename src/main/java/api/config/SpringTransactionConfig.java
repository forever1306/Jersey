package api.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class SpringTransactionConfig {
	@Autowired
	private DataSource dataSource;
	
	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean(){
		LocalSessionFactoryBean bean=new LocalSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setPackagesToScan("api.entity");
		
		Properties properties=new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		properties.put("hibernate.show_sql", true);
		properties.put("hibernate.format_sql",true);
		bean.setHibernateProperties(properties);
		return bean;
	}
}
