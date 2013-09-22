#!/usr/bin/perl

$fichier = $ARGV[0];

open(FILE,$fichier) or die("Could not open the file.");

foreach $line (<FILE>) {
	$line =~ s/\r//g;
	$line =~ s/\n//g;
	#$line =~ s/\lf//g;
	print $line;
}
