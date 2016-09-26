from __future__ import unicode_literals

from django.db import models
from django.utils import timezone


# Create your models here.

class Contact (models.Model):
    name = models.CharField(max_length=50)
    number = models.CharField(max_length=10)

    def __str__(self):
        return self.name


