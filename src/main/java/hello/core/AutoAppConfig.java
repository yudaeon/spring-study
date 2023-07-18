package hello.core;

import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //지정을 안하게 되면 @ComponentScan를 붙인 클래스의 모든 하위 패키지를 다 확인한다.
        basePackages = "hello.core.member",
        basePackageClasses = AutoAppConfig.class,
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) //전부 스캔하지 않고 필터를 거친다.
)
public class AutoAppConfig {

    @Bean(name = "memoryMemberRepository")
    MemoryMemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
