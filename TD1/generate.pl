#!/usr/bin/perl

my @ls = glob('./LCI/*.html');

## Copy all the LCI articles in the export folder
foreach $fichier (@ls) {
	$fichier =~ /.\/LCI\/(.*)/;
	#`perl convert2.pl $fichier > ./export/convert_$1`;
	`perl one_line.pl $fichier > ./export/one_line_$1`;
	`perl split.pl ./export/one_line_$1 > ./export/split_$1`;
}

## Generate the corpus xml
# to add if convert to latin1
$content = "<CORPUS>";
my @ls = glob('./export/split_*.html');
foreach $fichier (@ls) {
	$content .= `perl extract.pl $fichier`;
}
$content .= "</CORPUS>";

print $content;