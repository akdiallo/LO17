use Encode;
use Unicode::String;
#Unicode::String->stringify_as('utf8');

$fname = $ARGV[0];
`touch ~/TD/corpus_bloc/$fname`;
#`touch ~/Documents/lo17/TD/corpus_bloc/$fname`;
open(FICHIN, 'corpus_initial/LCI/'.$fname) or die "Cannot open fichier: $fname";
open(FICHOUT, '>corpus_bloc/'.$fname) or die "Cannot open FICHOUT";

while($_=<FICHIN>) {
 if(/IBL_ID=27303/ || /Blc=27303/){
   do{
     $u = encode('latin1',decode('utf8',$_));
     print FICHOUT $u;
     $_=<FICHIN>;
   }until(/IBL_ID=27916 - Temps/ || /Blc=27916, [0-9]/);
     $u = encode('latin1',decode('utf8',$_));
     print FICHOUT $u;
 }
}

close(FICHIN);
close(FICHOUT);
