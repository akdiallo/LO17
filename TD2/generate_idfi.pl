#!/usr/bin/perl

$fichier = "liste_mots";

$n_doc = `cat corpusA09.xml | grep "<PAGE_LCI>" | wc -l`;

open(FILE,$fichier) or die("Could not open the file.");

foreach $line (<FILE>) {
	#print $line;
	#print $line;
	chomp $line;
	$dfi = `cat tfij | grep " $line\t" | wc -l`;
	chomp $dfi;
	$dfi =~ s/^\s+|\s+$//g;
	if ($dfi > 0) {
		$idfi = (log($n_doc/$dfi))/log(10);
		print "$line \t\t dfi:$dfi \t\t idfi:$idfi\n";
	}
}
