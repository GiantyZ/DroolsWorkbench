package com.lenovohit.drools;

import com.lenovohit.drools.utils.KieUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.runtime.KieSession;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DroolsApplicationTests {

	@Test
	public void contextLoads() {
		KieSession kieSession = KieUtils.getKieContainer().newKieSession();
		int ruleFiredCount = kieSession.fireAllRules();
		System.out.println("触发了" + ruleFiredCount + "条规则");
		kieSession.dispose();
	}
}