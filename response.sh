#!/bin/bash
echo "\n .........Detecting the USER........"

sudo tcpdump -i eth0 icmp and icmp[icmptype]=icmp-echo -n -c 5 > Reply.txt
sleep 6
java response
 
