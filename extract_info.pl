#!/usr/bin/perl
### Extract info one article 


$fichier = $ARGV[0];

open(FILE,$fichier) or die("Could not open the file.");

foreach $line (<FILE>) {
	#<INFO><fichier_name>lci-monde-2005-02-25.html</fichier_name><date>vendredi 25 février 2005</date></INFO>
	$line =~ /<fichier_name>(.*?)<\/fichier_name><date>(.*?)<\/date>/;
	$fichier_name = $1;
	$date_page = $2;
}

print 
"	<FICHIER>".$fichier_name."</FICHIER>
	<DATE_PAGE>".$date_page."</DATE_PAGE>";