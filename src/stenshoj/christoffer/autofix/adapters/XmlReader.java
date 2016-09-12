package stenshoj.christoffer.autofix.adapters;

import java.io.File;

public interface XmlReader<T> {
	T read(File file) throws Exception;
}
