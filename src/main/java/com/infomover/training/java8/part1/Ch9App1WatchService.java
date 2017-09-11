package com.infomover.training.java8.part1;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class Ch9App1WatchService {

	public static void main(String[] args) throws Exception {
		
		WatchService watchService = FileSystems.getDefault().newWatchService();

		Path path = Paths.get(System.getProperty("user.home"));

		/**
		 * The 1st parameter is watchService and 2nd parameter is vargs of type StandardWatchEventKinds. Provide
		 * 3 kinds : ENTRY_CREATE, ENTRY_DELETE & ENTRY_MODIFY 
		 * 
		 */
		
	//	path.register(<< parameter 1>>, << Parameter 2...args.>>);

		WatchKey key;

		
		while ((key = watchService.take()) != null) {

			for (WatchEvent<?> event : key.pollEvents()) {
				
					System.out.println("Event kind:" + event.kind() + ". File affected: " + event.context() + ".");
			}
			key.reset();
		}
	}

}
