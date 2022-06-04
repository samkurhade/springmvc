package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm() {

		return "fileform";
	}

	@RequestMapping(value = "/uploadimage", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file, HttpSession s, Model m) {

		System.out.println("File Upload Handler");

		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());

		// getting data

		byte[] data = file.getBytes();

		// we have to save this file on server
		String pathString = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources"
				+ File.separator + "img" + File.separator + file.getOriginalFilename();
		System.out.println(pathString);
		try {
			FileOutputStream fos = new FileOutputStream(pathString);
			fos.write(data);
			fos.close();
			System.out.println("File uploaded");

			m.addAttribute("msg", "Uploaded Successfully...");
			m.addAttribute("filename", file.getOriginalFilename());

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("uploading error...");
			m.addAttribute("msg", "Uploading Error...");
		}

		return "filesuccess";
	}
}
