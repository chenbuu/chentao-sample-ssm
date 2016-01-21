package com.ssm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ssm.security.SessionSecurity;

import lombok.extern.slf4j.Slf4j;

/**
 * 下载
 * @author ChenTao
 * @date 2015年8月12日下午11:52:40
 */
@Controller
@Slf4j
public class Download {

	@Autowired
	public MVCConfig config;

	@Autowired
	private SessionSecurity sessionSecurity;

	/**
	 * 下载主方法
	 * 直接保存文件
	 * @author ChenTao
	 * @date 2015年8月12日下午11:52:49
	 */
	//@RequestMapping("/download/{id:.*}")
	/*public void downloadold(@PathVariable("id") String id, HttpServletResponse response, HttpSession session, ModelMap map) throws Exception {
		log.debug("{}", id);
		if (!this.sessionSecurity.getMethod(session)) {
			throw new Exception("权限错误");
		}
		FileInfo fileInfo = this.fileInfoRepository.findOne(id);
		if (fileInfo == null) {
			throw new Exception("文件不存在");
		}
		response.setContentType("application/octet-stream; charset=utf-8");
		response.setHeader("Content-Disposition", "attachment; filename=" + new String(fileInfo.getFilename().getBytes("utf-8"), "ISO-8859-1"));
		ServletOutputStream out = response.getOutputStream();
		Files.copy(Paths.get(config.getUploadPath() + fileInfo.getFileUrl(), fileInfo.getId().toString()), out);
	}*/

	/**
	 * 下载主方法
	 * 不推荐使用
	 * @author ChenTao
	 * @date 2015年8月12日下午11:52:49
	 */
	//@RequestMapping("/download/{name:.*}")
	/*public void downloadold(@PathVariable("name") String name, HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream; charset=utf-8");
		ServletOutputStream out = response.getOutputStream();
		Files.copy(Paths.get(config.getUploadPath(), name), out);
	}*/

	/**
	 * 测试
	 * @author ChenTao
	 * @date 2015年8月13日上午10:37:55
	 */
	//@RequestMapping("/downloadcheck")
	/*public void downloadcheck(HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream; charset=utf-8");
		response.setHeader("Content-Disposition", "attachment; filename=" + new String("测试图片.jpg".getBytes("utf-8"), "ISO-8859-1"));
		ServletOutputStream out = response.getOutputStream();
		Files.copy(Paths.get(config.getUploadPath(), "测试图片.jpg"), out);
	}*/
}
