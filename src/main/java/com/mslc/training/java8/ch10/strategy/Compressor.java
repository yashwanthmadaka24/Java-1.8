package com.mslc.training.java8.ch10.strategy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * The actual component
 * 
 * @author MuhammedShakir
 *
 */
public class Compressor {

	private final CompressionStrategy strategy;

	public Compressor(CompressionStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * The compressor method in the component
	 * 
	 * @param inFile
	 * @param outFile
	 * @throws IOException
	 */
	public void compress(Path inFile, File outFile) throws IOException {
		try (OutputStream outStream = new FileOutputStream(outFile)) {
			Files.copy(inFile, strategy.compress(outStream));
		}
	}

	

}
