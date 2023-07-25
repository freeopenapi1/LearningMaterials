package kr.co.himedia.string;

public class StringTextBlockTest {

	public static void main(String[] args) {
		
		String textBlock = """
				
				This
				is
				text
				block
				""";
		System.out.println(textBlock);
		System.out.println();
		System.out.println(getHtmlBlock());
	}
	
	public static String getHtmlBlock() {
		return """

				<!DOCTYPE HTML>
				<html lang="en">
				<head>
				<!-- Generated by javadoc (20) -->
				<title>StringBuilder (Java SE 20 &amp; JDK 20)</title>
				<meta name="viewport" content="width=device-width, initial-scale=1">
				<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
				<meta name="description" content="declaration: module: java.base, package: java.lang, class: StringBuilder">
				<meta name="generator" content="javadoc/ClassWriterImpl">
				<meta name="keywords" content="java.lang.StringBuilder class">
				<meta name="keywords" content="compareTo()">
				<meta name="keywords" content="append()">
				<meta name="keywords" content="appendCodePoint()">
				<meta name="keywords" content="delete()">
				<meta name="keywords" content="deleteCharAt()">
				<meta name="keywords" content="replace()">
				<meta name="keywords" content="insert()">
				<meta name="keywords" content="indexOf()">
				<meta name="keywords" content="lastIndexOf()">
				<meta name="keywords" content="reverse()">
				<meta name="keywords" content="toString()">
				<link rel="stylesheet" type="text/css" href="../../../stylesheet.css" title="Style">
				<link rel="stylesheet" type="text/css" href="../../../script-dir/jquery-ui.min.css" title="Style">
				<script type="text/javascript" src="../../../script.js"></script>
				<script type="text/javascript" src="../../../script-dir/jquery-3.6.1.min.js"></script>
				<script type="text/javascript" src="../../../script-dir/jquery-ui.min.js"></script>
				</head>
				<body class="class-declaration-page">
				<script type="text/javascript">var pathtoroot = "../../../";
				loadScripts(document, 'script');</script>
				<noscript>
				<div>JavaScript is disabled on your browser.</div>
				</noscript>
				<div class="flex-box">
				<header role="banner" class="flex-header">
				<nav role="navigation">		
						
				""";
	}
}















