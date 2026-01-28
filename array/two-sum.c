typedef struct {
    int key;
    int value;
} HashItem;

#define HASH_SIZE 10000

int hash(int key) {
    return abs(key) % HASH_SIZE;
}

int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    HashItem* hashTable[HASH_SIZE] = {0};

    for (int i = 0; i < numsSize; i++) {
        int complement = target - nums[i];
        int hashIndex = hash(complement);

        while (hashTable[hashIndex] != NULL) {
            if (hashTable[hashIndex]->key == complement) {
                int* result = (int*)malloc(2 * sizeof(int));
                result[0] = hashTable[hashIndex]->value;
                result[1] = i;
                *returnSize = 2;
                return result;
            }
            hashIndex = (hashIndex + 1) % HASH_SIZE;
        }

        HashItem* newItem = (HashItem*)malloc(sizeof(HashItem));
        newItem->key = nums[i];
        newItem->value = i;

        int insertIndex = hash(nums[i]);
        while (hashTable[insertIndex] != NULL) {
            insertIndex = (insertIndex + 1) % HASH_SIZE;
        }
        hashTable[insertIndex] = newItem;
    }

    *returnSize = 0;
    return NULL;
}
