#!/usr/bin/perl

#use Unicode::String qw(utf8 latin1);

use Encode;

$fichier = $ARGV[0];

$fichier =~ /.\/LCI\/(.*)/;
$fichier_name = $1;

`touch ./export/convert_$fichier_name`;
print $fichier_name;
open(FILE,$fichier) or die("Could not open the file.");
open(FILOUT,' >export/convert_'.$fichier_name) or die("Could not open the file.");
# spécifie le format par défaut des chaînes en entrée
#Unicode::String->stringify_as('utf8');




while($_=<FILE>) {


  # convertir la ligne DOCTYPE .. UTF-8 en DOCTYPE .. iso8859-1
  # pour que le document converti puisse toujours
  # être affiché correctement par un navigateur
 (/DOCTYPE HTML/) && (s/[Uu][Tt][Ff]\-8/iso8859-1/);
 

  # instancier la chaîne en objet au format "neutre"
#  $u = Unicode::String->new($_);
  $u = encode("iso-8859-1",decode('utf8',$_));

  # rendre la chaîne sous un format iso8859-1
  print FILOUT $u;

}

