package com.example.filesandfolders.components;

import com.example.filesandfolders.models.*;
import com.example.filesandfolders.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user1 = new User("user");
        userRepository.save(user1);

        Folder folder1 = new Folder("folder1", user1);
        folderRepository.save(folder1);

        File file1 = new File("file1", ".jpg", 50, folder1);
        fileRepository.save(file1);

    }

}
