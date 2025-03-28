#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.crypto --module-path aisco.product.crypto -m aisco.product.crypto &

wait