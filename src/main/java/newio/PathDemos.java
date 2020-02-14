package newio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemos {
    public static void main(String[] args) {
        // Using Paths.get(...) to create a Path
        Path dictionary = Paths.get("C:", "Users", "GregoryWatts", "git", "Advanced_Java", "src", "main", "java", "newio");
        System.out.println(dictionary);

        Path home = Paths.get("/Users/GregoryWatts");
        System.out.println(home);

        // Using resolve to find nested paths
        Path docs = home.resolve("Documents");
        System.out.println(docs);

        // Can resolve siblings as well
        Path downloads = docs.resolveSibling("Downloads");
        System.out.println(downloads);

        // Project directory
        Path project = Paths.get(".");
        System.out.println(project.normalize());
        System.out.println(project.toAbsolutePath());
        System.out.println("As a URI: " + project.normalize().toUri());

        // Normalize a path
        Path p = Paths.get("/Users/GregoryWatts/Documents/./Admin/..").normalize();
        System.out.println("Normalized: " + p);

        System.out.println("parent: " + project.toAbsolutePath().getParent());
        System.out.println("file name: " + project.toAbsolutePath().getFileName());
        System.out.println("root: " + project.toAbsolutePath().getRoot());
        for (Path path : project.toAbsolutePath()) {
            System.out.println(path);
        }

        File localDir = new File("..");
        System.out.println(localDir);
        System.out.println(localDir.toPath().toAbsolutePath().normalize());
    }
}
