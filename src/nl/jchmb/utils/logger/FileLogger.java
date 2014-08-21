package nl.jchmb.utils.logger;

import java.io.File;

public interface FileLogger extends Logger {
	public void setFile(File file);
}
