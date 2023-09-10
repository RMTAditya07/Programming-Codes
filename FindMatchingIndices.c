#include <stdio.h>
#include <string.h>

void findMatchingIndices(char str[]) {
    int len = strlen(str);
    int matchingIndices[len];
    int count = 0;

    for (int i = 0; i < len; i++) {
        if (str[i] == str[len - 1 - i]) {
            matchingIndices[count++] = i;
        }
    }

    printf("Indices with matching characters: ");
    for (int i = 0; i < count; i++) {
        printf("%d ", matchingIndices[i]);
    }
    printf("\n");
}

int main() {
    char original[] = "pnone";
    char reversed[100];

    // Create the reversed string
    int len = strlen(original);
    for (int i = 0; i < len; i++) {
        reversed[i] = original[len - 1 - i];
    }
    reversed[len] = '\0';

    printf("Original: %s\n", original);
    printf("Reversed: %s\n", reversed);

    findMatchingIndices(original);

    return 0;
}
