package com.example.filesandfolders;

import com.example.filesandfolders.models.*;
import com.example.filesandfolders.repositories.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesandfoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canAddUsersFoldersAndFiles(){
		User user2 = new User("user2");
		userRepository.save(user2);

		Folder folder2 = new Folder("folder2", user2);
		folderRepository.save(folder2);

		File file2 = new File("file2", ".jpg", 50, folder2);
		fileRepository.save(file2);
	}

}
