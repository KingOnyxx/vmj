#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.paypals --module-path aisco.product.paypals -m aisco.product.paypals &

wait