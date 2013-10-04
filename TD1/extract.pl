#!/usr/bin/perl
### Extract for one article 


$fichier = $ARGV[0];

print "
<PAGE_LCI>
".`perl extract_info.pl $fichier`."
	<UNE>".`perl extract_une.pl $fichier`."</UNE>
	<LES_VOIRAUSSI>".`perl extract_voiraussi.pl $fichier`."</LES_VOIRAUSSI>
	<FOCUS>".`perl extract_focus.pl $fichier`."</FOCUS>
	<LES_GROSTITRES>".`perl extract_grostitres.pl $fichier`."</LES_GROSTITRES>
	<LES_RAPPELS>".`perl extract_rappels.pl $fichier`."</LES_RAPPELS>	
</PAGE_LCI>";