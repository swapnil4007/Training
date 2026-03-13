package com.msedcl.main.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {
	
	 //depend on notification service
	private NotificationService notificationService;
	
	
    public LibraryService(NotificationService notificationService) {
    	super();
        this.notificationService = notificationService;
    }

    public void borrowBook() {
        System.out.println("Book borrowed successfully: ");
        notificationService.sendNotification("You borrowed the book: ");
    }


}
