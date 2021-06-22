package study.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class IOTest {

	private final static String FILE_DIRECTORY = "C:\\project\\java-study\\src\\file";

	public static void main(String[] args) throws IOException {
		Path path = Paths.get(FILE_DIRECTORY, "test.txt");

		System.out.println(path);
		System.out.println(path.getParent());
		System.out.println(path.toAbsolutePath());
		System.out.println(path.toUri());

		SeekableByteChannel seekableByteChannel = Files.newByteChannel(path, StandardOpenOption.APPEND);
		byte[] data = "channel append\n\r".getBytes(StandardCharsets.UTF_8);
		seekableByteChannel.write(ByteBuffer.wrap(data));
		seekableByteChannel.close();

		for (String line : Files.readAllLines(path, StandardCharsets.UTF_8)) {
			System.out.println(line);
		}

		// Files.createFile(Path.of(FILE_DIRECTORY, "createFile.txt"));
		Path copyPath = Path.of(FILE_DIRECTORY, "copyFile.txt");
		Files.copy(path, copyPath, StandardCopyOption.REPLACE_EXISTING);

		System.out.println(Files.deleteIfExists(copyPath));
		Files.writeString(Path.of(FILE_DIRECTORY, "createFile.txt"), "test1", StandardOpenOption.APPEND);

		System.out.println(Files.getFileStore(path));
		// Files.createSymbolicLink(Path.of(FILE_DIRECTORY, "symbolicLink"), path);
		// Files.createLink(Path.of(FILE_DIRECTORY, "hardLink"), path);
	}

}
