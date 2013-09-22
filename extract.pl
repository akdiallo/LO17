#!/usr/bin/perl
### Extract for one article 


$fichier = $ARGV[0];

open(FILE,$fichier) or die("Could not open the file.");

foreach $line (<FILE>) {
	
	### GET DATE_PAGE
	
	#<td width="100%" align="right" valign="middle" class="S9"> lundi 31 octobre 2005</td>	
	$line =~ /class="S9"> (.*?)<\/td>/;
	$date_page = $1;

}

$fichier =~ /.\/export\/(.*)/;
$fichier_name = $1;
print "
<PAGE_LCI>
	<FICHIER>".$fichier_name."</FICHIER>
	<DATE_PAGE>".$date_page."</DATE_PAGE>
	<UNE>
".`perl une.pl $fichier`."
	</UNE>
	<LES_VOIRAUSSI>
".`perl voiraussi.pl $fichier`."
	</LES_VOIRAUSSI>
	<FOCUS>
".`perl voiraussi.pl $fichier`."
	</FOCUS>
	<LES_GROSTITRES>".$les_grostitres."</LES_GROSTITRES>
	<LES_RAPPELS>".$les_rappels."</LES_RAPPELS>
</PAGE_LCI>";