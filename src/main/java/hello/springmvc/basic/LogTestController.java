package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController //restapi의 그 rest임 return에 스트링 넣으면 뷰를 찾는게 아니라 http메세지 바디에 바로 ㄴ력함
public class LogTestController {

    //private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        //log.trace("trace log="+name); 이렇게 사용하면 안됌!!쓸데없는 연산 발생

        log.trace("trace log={}",name);
        log.debug("debug log={}",name);
        log.info("info log={}",name);
        log.warn("warn log={}",name);
        log.error("error log={}",name);


        return "ok";
    }
}
