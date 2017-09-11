package com.infomover.training.java8.ch10.strategy;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;

/**
 * One of the strategies
 * 
 * @author MuhammedShakir
 *
 */
public class ZipCompressionStrategy implements CompressionStrategy {

	@Override
	public OutputStream compress(OutputStream data) throws IOException {
		return new ZipOutputStream(data);
	}

}
