package com.codewithmosh.solutions.adapter;

public class Demo {
  public static void show() {
    var client = new EmailClient();
    client.addProvider(new GmailAdapter());
    client.downloadEmails();
  }
}
