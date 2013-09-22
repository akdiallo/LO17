#!/usr/bin/perl

my @ls = glob('./LCI/*.html');

### Copy all the LCI articles in the export folder
foreach $fichier (@ls) {
	$fichier =~ /.\/LCI\/(.*)/;
	`perl one_line.pl $fichier > ./export/$1`;
}

### Generate the corpus xml
$content = "<CORPUS>";
my @ls = glob('./export/*.html');
foreach $fichier (@ls) {
	$content .= `perl extract.pl $fichier`;
}
$content .= "</CORPUS>";

print $content;