package com.example.filesandfolders.repositories;

import com.example.filesandfolders.models.File;
import projections.EmbedFolderForFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolderForFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
