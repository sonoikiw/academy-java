package com.bptn.course._builtin_exceptions._01_checked_exceptions;

import java.util.Scanner;
//Custom exception class
public class FileExtensionException extends Exception {
 // Parameterized constructor
 public FileExtensionException(String message) {
     super(message);
 }
}