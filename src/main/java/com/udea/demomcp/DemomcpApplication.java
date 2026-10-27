package com.udea.demomcp;

import com.udea.demomcp.service.TareaToolsService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.ReflectionUtils;

@SpringBootApplication
public class DemomcpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemomcpApplication.class, args);
	}
/**  Registra los metodos anotados con @Tool del bean TareaTools
como herramienta MCP disponible para elciente (Claude Desktop)

 */

@Bean
	public ToolCallbackProvider tareaTools(TareaToolsService tools){
	return MethodToolCallbackProvider.builder()
			.toolObjects(tools)
			.build();
}

}
