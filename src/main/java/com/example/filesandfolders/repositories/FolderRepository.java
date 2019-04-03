package com.example.filesandfolders.repositories;

import com.example.filesandfolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import projections.EmbedUserForFolder;

@RepositoryRestResource(excerptProjection = EmbedUserForFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
