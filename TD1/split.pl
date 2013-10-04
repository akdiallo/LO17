#!/usr/bin/perl

$fichier = $ARGV[0];

open(FILE,$fichier) or die("Could not open the file.");


### GET FICHIER NAME
$fichier =~ /.\/export\/(.*)/;
$fichier_name = $1;
print "<INFO><fichier_name>".$fichier_name."</fichier_name>";
foreach $line (<FILE>) {
	### GET DATE_PAGE
	#<td width="100%" align="right" valign="middle" class="S9"> lundi 31 octobre 2005</td>	
	$line =~ /class="S9"> (.*?)<\/td>/;
	$date_page = $1;
}
print "<date>".$date_page."</date></INFO>\n\n";

seek FILE, 0, 0;
foreach $line (<FILE>) {
	### GET UNE
	$line =~ /<!-- Bloc IBL_ID=27914 - "GeneralOuvre" -->(.*?)<!-- \/Bloc IBL_ID=27914/;
	print "<UNE>".$1."</UNE>\n\n";
}

seek FILE, 0, 0;
foreach $line (<FILE>) {
	### GET VOIR AUSSI
	#$line =~ /A voir aussi :(.*?)href="(.*?)" class="S48">(.*?)\((.*?)\)<\/a>(.*?)<\/span>(.*?)<\/span>/;
	$line =~ /A voir aussi :(.*?)<!-- \/Bloc IBL_ID=27914/;
	$voir_aussi = $1;
	$voir_aussi =~ s/<a href=/\n<VOIRAUSSI>/g;
	print "<LES_VOIRAUSSI>\n".$voir_aussi."\n</LES_VOIRAUSSI>\n\n";
}

seek FILE, 0, 0;
foreach $line (<FILE>) {
	### GET FOCUS
	$line =~ /<!-- Bloc IBL_ID=27913(.*?)<!-- \/Bloc IBL_ID=27913/;
	print "<FOCUS>".$1."</FOCUS>\n\n";
}

seek FILE, 0, 0;
foreach $line (<FILE>) {
	### GET LES GROSTITRE
	$line =~ /<!-- Bloc IBL_ID=27915(.*?)<!-- \/Bloc IBL_ID=27915/;
	$les_gros_titres = $1;
	$les_gros_titres =~ s/<td valign="top"><a href="\//\n<GROSTITRE>/g;
	print "<LES_GROSTITRES>\n".$les_gros_titres."</LES_GROSTITRES>\n\n";
}

seek FILE, 0, 0;
foreach $line (<FILE>) {
	### GET LES RAPPELS
	$line =~ /<!-- Bloc IBL_ID=27916(.*?)<!-- \/Bloc IBL_ID=27916/;
	$les_rappels = $1;
	$les_rappels =~ s/<td valign="top" width="100%">/\n<RAPPEL>/g;
	print "<LES_RAPPELS>\n".$les_rappels."</LES_RAPPELS>\n\n";
}