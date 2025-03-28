#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.pacildonation --module-path aisco.product.pacildonation -m aisco.product.pacildonation &

wait