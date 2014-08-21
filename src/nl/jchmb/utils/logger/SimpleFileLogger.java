package nl.jchmb.utils.logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileLogger implements FileLogger {
	private File file;

	@Override
	public void writeLog(String message) {
		try {
			FileWriter writer = new FileWriter(file, true);
			writer.append(message + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setFile(File file) {
		this.file = file;
	}
}
