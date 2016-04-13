#!/bin/bash
echo "\n .........Programme to Read ping Packets........"

echo -n "\n Enter ping command >>"
read ip_address
echo "\n Please wait executing ..."
$ip_address -c 4 >request.txt
sleep 6
java hello
