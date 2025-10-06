<template>
  <div class="flex flex-col min-h-screen">
    <UBanner icon="i-lucide-school" title="มหาวิทยาลัยราชภัฏเพชรบุรี จังหวัดเพชรบุรี" to="https://www.pbru.ac.th/"
      target="_blank" />
    <app-header />
    <UPageCard spotlight-color="primary" spotlight>
      <u-main>
      <slot />
    </u-main>
    </UPageCard>
    <app-footer />
  </div>
</template>

<script lang="ts" setup>

</script>

<style></style>