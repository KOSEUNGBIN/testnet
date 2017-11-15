#!/bin/bash

function pingtest()
{
  filename="$(date +%Y)-$(date +%m)-$(date +%d)_$(date +%H)-$(date +%M)"
  echo '' >> $filename.txt
  while read line
  do
    ping -c10 -W2 -q $line

    if [  $? -eq 0  ];  then
      echo $line 'success' >> $filename.txt
    elif [  $? -eq 1  ];  then
      echo $line 'fail' >> $filename.txt
    else
      echo $line 'Error' $? >>  $filename.txt
    fi

  done < $1
}

function logintest()
{
    cd ../build/libs
    java -jar testnet-1.0-SNAPSHOT.jar $1 $2
}

if [  $# -ne 3  ];  then
  echo "Usage : $0 <Input File For Ping> <Student ID> <Student Password>"
else
    pingtest    $1
    logintest   $2  $3

fi


