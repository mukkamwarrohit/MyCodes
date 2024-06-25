<!-- suppose we have file and we directly want to print it -->
<?php
echo readfile("filename.txt");
?>



<!-- we have to create a file -->

<?php
$file=fopen("filname.txt","w");
?>

<!-- we have to write some contents in that file -->
<?php
    $file=fopen("filname.txt","w");

    $txt="this is the content we have to write in that file"

    fwrite($file,$txt);
?>

