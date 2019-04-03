package projections;

import com.example.filesandfolders.models.*;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUserForFolder {
    String getTitle();
    List<File> getFiles();
    User getUser();
}
