#!/usr/bin/perl

$fichier = "tfij";

open(FILE,$fichier) or die("Could not open the file.");

foreach $line (<FILE>) {
	#print $line;
	$values = split(" ", $line);
	print $values;
}
