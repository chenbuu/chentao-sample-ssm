package com.ssm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ssm.security.SessionSecurity;

import lombok.extern.slf4j.Slf4j;

/**
 * 上传
 * @author ChenTao
 * @date 2015年11月19日下午8:40:56
 */
@Controller
@Slf4j
public class Upload {

	@Autowired
	public MVCConfig config;

	@Autowired
	private SessionSecurity sessionSecurity;

	/**
	 * 单个文件上传
	 * 不推荐使用
	 * @author ChenTao
	 * @date 2015年11月19日下午8:41:04
	 */
	/*@ResponseBody
	@RequestMapping("/upload")
	public Map<String, Object> upload(MultipartFile file, HttpSession session, ModelMap map) throws Exception {
		if (file == null) {
			throw new Exception("file错误");
		}
		Map<String, Object> dataMap = new HashMap<String, Object>();
		log.debug("{}", file.getOriginalFilename());
		if (!this.sessionSecurity.getMethod(session)) {
			throw new Exception("权限错误");
		}
		User user = (User) session.getAttribute("user");
		FileInfo fileInfo = new FileInfo();
		fileInfo = gridFSRepository.saveFile(file.getInputStream());
		fileInfo.setStatus(StatusEnum.Use);
		fileInfo.setOperatorId(user == null ? null : user.getId());
	
		//打算存放文件的路径
		String fileUrl = DateFormat.getUploadDateStr() + "/";
		String filepath = config.getUploadPath() + fileUrl;
		fileInfo.setFileUrl(fileUrl);
		this.fileInfoRepository.save(fileInfo);
		//查看该路径存在与否，遇过不存在，创建路径
		if (!new File(filepath).isDirectory()) {
			new File(filepath).mkdirs();
		}
		try (InputStream is = file.getInputStream()) {
			Files.copy(is, Paths.get(filepath, fileInfo.getId().toString()));
		}
		dataMap.put("success", true);
		return dataMap;
	}*/

	/**
	 * 单个文件上传
	 * 不推荐使用
	 * @author ChenTao
	 * @date 2015年11月19日下午8:41:04
	 */
	//@RequestMapping("/uploadold")
	/*public void uploadold(MultipartFile file) throws IOException {
		try (InputStream is = file.getInputStream()) {
			Files.copy(is, Paths.get(config.getUploadPath(), file.getOriginalFilename()));
		}
	}*/

	/**
	 * 多个文件上传
	 * 不推荐使用
	 * @author ChenTao
	 * @date 2015年11月19日下午8:41:12
	 */
	//@RequestMapping("/uploads")
	/*public void uploads(ArrayList<MultipartFile> file) throws IOException {
		for (MultipartFile multipartFile : file) {
			try (InputStream inputStream = multipartFile.getInputStream()) {
				Files.copy(inputStream, Paths.get(config.getUploadPath(), multipartFile.getOriginalFilename()));
			}
		}
	}*/

}
